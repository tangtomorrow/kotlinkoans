package org.tym.i_introduction._4_Lambdas;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.tym.util.JavaCode;

import java.util.Collection;

public class JavaCode4 extends JavaCode {
    public boolean task4(Collection<Integer> collection) {
        return Iterables.any(collection, new Predicate<Integer>() {
            public boolean apply(Integer element) {
                return element % 42 == 0;
            }
        });
    }
}
