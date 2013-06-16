/**
 *
 */
package org.loveyoupeng.edr.model
import org.specs2._
import specification._

/**
 * @author loveyoupeng
 *
 */
class NamedEntitySpec extends Specification with ScalaCheck {
  def is =
    "Name spec" ^ br ^
      "Given a id in string ${Context}" ^ aString ^
      "When construct a Name object" ^ buildName ^
      "Then the object's content should not be same with ${Context}" ^ sameContent ^
      end

  val aString: Given[String] = (_: String).toString()
  val buildName: When[String, Name] =
    (nameString: String) => (text: String) => Name(nameString)

  val sameContent: Then[Name] =
    (name: Name) => (text: String) => name.name must beEqualTo(text)

}