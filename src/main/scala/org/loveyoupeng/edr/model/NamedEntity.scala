/**
 *
 */
package org.loveyoupeng.edr.model

/**
 * @author loveyoupeng
 *
 */
trait NamedEntity { self: { val name: Name } =>
  def alias: Set[Name]
}