package com.ikempf

import com.ikempf.Problem011.encodeOptimized
import org.scalatest.{FlatSpec, Matchers}

class Problem011Test extends FlatSpec with Matchers {

 "EncodeModified" should "use optimized run-length compression" in {
   encodeOptimized(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
 }

}