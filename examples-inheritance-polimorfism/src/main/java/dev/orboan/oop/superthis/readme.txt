super vs this in inheritance
----------------------------
The difference between using this or super applies when a field or a method from the superclass is hidden by the subclass:

- A superclass field is hidden by the subclass when it's declared again in the subclass.(Example: the HEADER final field)
- A superclass method is hidden by the subclass when it's overriden (@Override) in the subclass. (Examples: the toString method)

In any othe case, as the public and protected fields and methods are inherited by the subclasses, using this or super (on these inherited fields or methods) makes no difference (Example: the usualLifeStyle array or the ARRAY_LENGTH final field)

Here's also an example on how to use the super() call to the superclass constructor from the subclass constructor.

Oriol Boan

