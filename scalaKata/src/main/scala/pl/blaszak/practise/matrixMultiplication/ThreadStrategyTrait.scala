package pl.blaszak.practise.matrixMultiplication

trait ThreadStrategyTrait {
  def execute[A](func : Function0[A]): Function0[A]
}
