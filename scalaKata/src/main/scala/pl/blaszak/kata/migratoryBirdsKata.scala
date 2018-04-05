package pl.blaszak.kata

/*
You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested
in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to
your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings.
If two or more types of birds are equally common, choose the type with the smallest ID number.

Complete the migratoryBirds function which takes  arguments, an integer  and an integer array  and returns an integer
denoting the type number of the most common bird.

Constraints
5 <= n <= 2 * 10^5

It is guaranteed that each type is 1, 2, 3, 4, or 5.
Raw Input Format

The first line contains an integer denoting , the number of birds sighted and reported in the array .
The second line describes ar as n space-separated integers representing the type numbers of each bird sighted.

Sample Input 0

6
1 4 4 4 5 3
Sample Output 0

4
Explanation 0

The different types of birds occur in the following frequencies:

Type 1:1  bird
Type 2:0  birds
Type 3:1  bird
Type 4:3  birds
Type 5:1  bird
The type number that occurs at the highest frequency is type , so we print  as our answer.
 */

object migratoryBirdsKata {

  def migratoryBirds(array: Array[Int]): Int = {
    val frequencyMap = array.groupBy(identity).mapValues(_.length)
    val maxFrequency = frequencyMap.valuesIterator.max
    frequencyMap.filter(_._2 == maxFrequency).min._1
  }
}
