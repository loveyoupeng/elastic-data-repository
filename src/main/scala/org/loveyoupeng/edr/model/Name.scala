/**
 *
 */
package org.loveyoupeng.edr.model

import org.loveyoupeng.edr.model.exception.ValidationException

/**
 * @author loveyoupeng
 *
 */
case class Name private (val value: String) extends AnyVal

object Name {
  implicit val DummyValidator = (text: String) => Right(text)
  implicit val DefaultTransformer = (text: String) => text.trim()

  def make(value: String)(implicit validator: String => Either[Seq[String], String] = DummyValidator,
    transformer: String => String = DefaultTransformer): Name = {
    val validation = validator(value)
    if (validation.isRight)
      new Name(transformer(value))
    else throw ValidationException(validation.left.get)
  }
}

 
