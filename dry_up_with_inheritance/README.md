# DRY up with inheritance

Clone this repository and navigate to this. 

```bash
 cd dry_up_with_inheritance
```

This folder contains several classes found in the src directory that are fully implemented. However,there is some duplication of code involved. Refactor the code using inheritance and composition to avoid duplication of code where possible. All tests should continue to pass.

To run the tests

```
 gradle test
```

## Solution

1. A Character super class was created and all common members of the Wizard and Dwarf 
classes were promoted. Wizard and Dwarf were made sub classes of Character.

2. A weapon super class was created and all common members of Knife and Hammer were 
promoted. Hammer and Knife were made sub classes of Weapon.

3. Constructors are not inherited so they remain in the sub classes.

4. Two test classes for the new classes were added, existing tests remain the same.

To run the tests

```bash
  gradle test
```
