# Probability of a com.mhl.AAAAAEvent

## com.mhl.AAAAAEvent Interface
- action();  // define your action
- happening(); // calculate the probability of the event,and decide whether happen

```java
    @Test
    public void should_happened_and_return_probability() {
        // given
        final com.mhl.AAAAAEvent event = () -> System.out.print("Hello World");

        // when
        final double happening = event.happening();

        // then
        System.out.println(happening);
    }
```

