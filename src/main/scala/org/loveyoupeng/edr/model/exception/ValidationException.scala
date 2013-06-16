/**
 *
 */
package org.loveyoupeng.edr.model.exception

/**
 * @author loveyoupeng
 *
 */
case class ValidationException(messages: Seq[String])
  extends Exception(messages.foldLeft("")((message, item) => message + item))