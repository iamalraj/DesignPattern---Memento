# DesignPattern - Memento

The Memento Design Pattern, described by the Gang of Four in their book, is a behavioral design pattern. The Memento Design Pattern offers a solution to implement undoable actions. We can do this by saving the state of an object at a given instant and restoring it if the actions performed since need to be undone.

Practically, the object whose state needs to be saved is called an Originator. The Caretaker is the object triggering the save and restore of the state, which is called the Memento.

The Memento object should expose as little information as possible to the Caretaker. This is to ensure that we don't expose the internal state of the Originator to the outside world, as it would break encapsulation principles. However, the Originator should access enough information in order to restore to the original state.
