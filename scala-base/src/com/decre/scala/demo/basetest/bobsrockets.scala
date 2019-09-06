package com.decre.scala.demo.helloworld

/**
  * @author liaofa
  * @date 2019/9/3
  */
package bobsrockets {
  package navigation{
    private[bobsrockets] class Navigator {
      protected[navigation] def useStarChart() {}
      class LegOfJourney {
        private[Navigator] val distance = 100
      }

      private[this] var speed = 200
    }
  }

  package launch {
    import navigation._
    object Vehicle{
      private[launch] val guide = new Navigator
    }
  }
}
