# 4.5 DRY up with inheritance Solution

Clone this repository and navigate to the drill 4.5 folder. 

```bash
  cd 4.5_dry_up_with_inheritance
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
