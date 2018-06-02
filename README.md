# Drills for JAVA-001

This repository contains drills and their solutions for Thinkful's *JAVA-001: Programming fudnamentals in Java* curriculum.

Drills are are meant to give learners practice with a skill or set of related skills. Each drill features a description or set of requirements, as well as an example solution the learner can compare their work to.

## For learners

The `master` branch of this repository contains a folder for each drill in the curriculum. For each drill, you'll find a Markdown file that contains a description of the requirements, along with any scaffolding to needed complete the drill (note that not all drills feature scaffolding).

In the `solutions` branch of this repository, you'll find example solutions for each drill. As a learner, you're on the honor system here: we ask that you hold off on looking at any solutions until you've put in a good faith effort at coming up with your own solution.

Navigate to folder - e.g.:

```bash
	cd 1.1_declaring_and_printing_variables
```

To compile:
```bash
	javac com/thinkful/drills/DeclareAndPrintSolution.java
```

To run:
```bash
	java com.thinkful.drills.DeclareAndPrintSolution
```

## For curriculum contributors

If you're a contributor to this project, here's what you need to know:

- For each drill you create, add an appropriately named folder. Inside this folder, add a README.md file that contains instructions and requirements the student will need to complete the drill. If there is any scaffolding supplied for the drill, it should go in this new folder as well. In short, everything a learner would need to get going  should be contained in the folder for the drill. **All of this should eventually live in the `master` branch**, but your work should be done in a feature branch, and you should make a pull request into `master`.
- As a contributor, you also should create example solutions for each drill. Working solutions should be put in the folder for the drill, **but in the `solutions` branch of this repo**. Solutions should follow all best practices and coding style guidlines we teach in the course. They should also feature extensive commenting to aid learners in reading through the solution. This work should be done in a separate feature branch that branches from the set up branch that will eventually be merged into `master`. That way if the PR into master necessitates changes to set up code or description, it will be easy to pull these changes into the solutions feature branch.