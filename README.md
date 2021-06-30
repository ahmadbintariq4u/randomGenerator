#  A Basic Library for Collection Classes

<h2>Example Code</h2>

<pre>
package testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import randomgenerator.RandomGenerator;

public class Testing {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();
        RandomGenerator.fillInt(list, 10);
        RandomGenerator.iterate(list);
       
    }
    
}
</pre>
