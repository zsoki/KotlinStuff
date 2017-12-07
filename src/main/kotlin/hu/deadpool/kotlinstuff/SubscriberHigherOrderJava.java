package hu.deadpool.kotlinstuff;

import kotlin.Unit;

// TODO demonstrating closures
public class SubscriberHigherOrderJava {

    public SubscriberHigherOrderJava(ObserverHigherOrder observerHigherOrder) {
        int happeningCounter = 0;
        observerHigherOrder.onEvent(() -> {
//            happeningCounter++;
//            return "No matter what I write here, it won't compile.";
            return Unit.INSTANCE;
        });
    }

}
