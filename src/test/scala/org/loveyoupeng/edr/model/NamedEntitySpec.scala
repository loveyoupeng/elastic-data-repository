/**
 *
 */
package org.loveyoupeng.edr.model
import org.loveyoupeng.edr.model.Name._
import org.specs2.mutable._

/**
 * @author loveyoupeng
 *
 */
class NamedEntitySpec extends Specification {

  "The 'Name' " should {
    "trim the content string" in {
      val nameString = "test name"
      val nameStringWithWithSpace = "\t\b" + nameString + "\t\t"
      import org.loveyoupeng.edr.model.Name.DefaultTransformer
      val name: Name = Name.make(nameString)()
      name.value must beEqualTo(nameString)
    }
  }

}