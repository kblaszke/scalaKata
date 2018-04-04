package pl.blaszak.practise.matrixMultiplication

import java.util.concurrent.{Callable, Executors}

object threadStrategy {

  object sameThreadStrategy extends ThreadStrategyTrait {
    def execute[A](func : Function0[A]): Function0[A] = func
  }

  object ThreadPoolStrategy extends ThreadStrategyTrait {
    val pool = Executors.newFixedThreadPool(java.lang.Runtime.getRuntime.availableProcessors)

    def execute[A](func : Function0[A] ) = {

      val future = pool.submit(new Callable[A] {
        def call() : A = {
          Console.println("Wykonanie funkcji w wątku: : " + Thread.currentThread.getName)
          func()
        }
      })
      () => future.get()
    }
  }
}
