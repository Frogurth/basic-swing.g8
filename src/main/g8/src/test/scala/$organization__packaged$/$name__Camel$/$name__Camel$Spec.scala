package $organization$.$name;format="Camel"$

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class $name;format="Camel"$Spec extends FlatSpec with ShouldMatchers {
  "The 'Hello world' string" should "contain 11 characters" in {
    "Hello world".length should equal (11)
  }
          
  it should "start with 'Hello'" in {
    "Hello world" should startWith("Hello")
  }
                    
  it should "end with 'world'" in {
    "Hello world" should endWith("world")
  }
}
