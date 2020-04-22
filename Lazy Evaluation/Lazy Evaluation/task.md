
## Lazy Evaluation

The proposed `Stream` implementation suffers from a serious potential performance
problem: If `tail` is called several times, the corresponding stream
will be recomputed each time.

This problem can be avoided by storing the result of the first
evaluation of `tail` and re-using the stored result instead of recomputing `tail`.

This optimization is sound, since in a purely functional language an
expression produces the same result each time it is evaluated.

We call this scheme *lazy evaluation* (as opposed to *by-name evaluation* in
the case where everything is recomputed, and *strict evaluation* for normal
parameters and `val` definitions.)

### Lazy Evaluation in Scala 

Haskell is a functional programming language that uses lazy evaluation by default.

Scala uses strict evaluation by default, but allows lazy evaluation of value definitions
with the `lazy val` form:

      lazy val x = expr

## Lazy Vals and Streams

Using a lazy value for `tail`, `Stream.cons` can be implemented more efficiently:

      def cons[T](hd: T, tl: => Stream[T]) = new Stream[T] {
        def head = hd
        lazy val tail = tl
        …
      }

## Exercise

Complete the `y` variable declaration for it to be lazy.