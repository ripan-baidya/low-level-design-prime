# Prototype

| Pattern Name | Category   | Complexity |
| ------------ | ---------- | ---------- |
| Prototype    | Creational | Medium     |

**Intent (One-liner):**
Create new objects by **cloning an existing object (prototype)** instead of creating from scratch.

## 1. Introduction (What + Why)

The Prototype design pattern is a creational pattern that allows creating new objects by copying an existing instance rather than instantiating a new one.

It is useful when:

- Object creation is expensive
- Objects have complex initialization
- Many objects share a similar structure

📌 Key idea: “Create once → clone many times”

## 2. Problem Statement (Why this pattern exists)

- Creating an object is costly (DB calls, heavy computation, network, config)
- Multiple objects have similar configuration
- Client should not depend on concrete class creation

❌ Without Prototype:

- Repeated expensive object creation
- Tight coupling to concrete classes

## 3. When to Use

Use Prototype when:

- Object creation is expensive or complex
- You need many similar objects
- You want to avoid subclass explosion
- Object configuration is mostly same with small variations

**Interview signals**:

- “Object creation is costly”
- “We want copies with slight changes”
- “Avoid new keyword everywhere”


## 4. When NOT to Use

Avoid Prototype when:

- Objects are simple and cheap to create
- Deep cloning is hard or error-prone
- Object graph is very complex
- Immutable objects are sufficient

📌 Mentioning deep copy issues scores points.

**Note: (Shallow vs Deep Copy)**

- **Shallow copy**: A shallow copy copies the object but not the objects it references.
So, both objects point to the same referenced objects.
- **Deep copy**: A deep copy copies the object and all nested objects recursively.
So, no shared references.

## 5. Core Components (Participants)

| Component                              | Responsibility             |
| ---                                    | ---                        |
| Prototype (Interface / Abstract Class) | Declares clone method      |
| ConcretePrototype                      | Implements cloning logic   |
| Client                                 | Creates objects by cloning |

## 6. UML / Structure (Mental Model)

- Link: 

## 7. Code

## 8. Real-World Use Cases

- Object cloning in games (characters, enemies)
- Document templates (resume, invoice)
- Caching preconfigured objects
- `Java`:
  - `Object.clone()`
  - `ArrayList.clone()`
- `Spring`:
  - `@Scope("prototype")` (conceptually related)

## 9. Pros & Cons

### ✅ Pros

- Faster object creation
- Reduces subclassing
- Decouples client from concrete classes
- Improves performance

### ❌ Cons

- Deep cloning is difficult
- Cloning complex object graphs is error-prone
- Copying mutable objects needs care

## 10. Related Patterns

- Factory Method → creates new instances
- Abstract Factory → creates families of objects
- Builder → step-by-step creation

## 11. Summary(Last Minute)

> **Use Prototype when object creation is expensive and you need many similar objects by cloning instead of creating from scratch.**

## 12. Resources

### Articles

- https://algomaster.io/learn/lld/prototype
- https://refactoring.guru/design-patterns/prototype
- https://www.baeldung.com/java-pattern-prototype

### Videos

- https://youtu.be/mTelfA9ccXE