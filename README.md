# Drillsets for JAVA-001

This repository contains drill sets and their solutions for Thinkful's *JAVA-001: Programming fudnamentals in Java* curriculum.

A *drillset* is a collection of one or more drills that are meant to give learners practice with a skill or set of related skills.

## For learners

The `master` branch of this repository contains a folder for each drillset in the curriculum. For each drillset, you'll find a Markdown file that contains a description of the requirements for each drill in the drillset, along with any scaffolding to needed complete the drills (note that not all drill ets have scaffolding).

In the `solutions` branch of this repository, you'll find example solutions for each drillset. As a learner, you're on the honor system here: we ask that you hold off on looking at any solutions until you've put in a good faith effort at coming up with your own solution.

## For curriculum contributors

If you're a contributor to this project, here's what you need to know:

- For each drillset you create, add an appropriately named folder. Inside this folder, add a README.md file that contains instructions and requirements the student will need to complete the drillset. If there is any scaffolding supplied for the drillset, it should go in this new folder as well. In short, everything a learner would need to get going  should be contained in the folder for the drillset. **All of this should eventually live in the `master` branch**, but your work should be done in a feature branch, and you should make a pull request into `master`.
- As a contributor, you also should create example solutions for each drill in a drillset. Working solutions should be put in the folder for the drillset, **but in the `solutions` branch of this repo**. Solutions should follow all best practices and coding style guidlines we teach in the course. They should also feature extensive commenting to aid learners in reading through the solution. This work should be done in a separate feature branch that branches from the set up branch that will eventually be merged into `master`. That way if the PR into master necessitates changes to set up code or description, it will be easy to pull these changes into the solutions feature branch.