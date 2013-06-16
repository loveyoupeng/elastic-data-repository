/**
 *
 */
package org.loveyoupeng.edr.model

/**
 * @author loveyoupeng
 *
 */
trait NamedEntity { self: { val name: Name } =>
  val alias: Set[Name] = Set()
  def containsAlia(name: Name) = alias.contains(name)
}