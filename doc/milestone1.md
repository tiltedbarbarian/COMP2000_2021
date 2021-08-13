## Major creative work

Your major creative work is worth 60% of your unit total and is made up of four components:

  * Milestone 1: 8%
  * Milestone 2: 10%
  * Milestone 3: 12%
  * Viva Exam: 30%

## Milestone 1

For the first stage in your major project you must improve the graphics of your basic grid. You should start from the repository branch tagged as "milestone1" (this will include the solution to task 6 though 9). If you wish to start early you can use the main branch from week 3 instead but you will need to solve the week 3 tasks first.

## Pass Level

A grid represents a landscape, have the cells drawn in different colours to represent different kinds of landscape. Each natural landscape item will have an elevation (height above sea level). Higher elevations should be drawn in lighter shades, lower elevations should be drawn in darker shades. For full marks you must have either a colour or an elevation field in your Cell class that is used for the drawing of the cell.

The allowed range of elevations is between 500m below sea level and 6000m above sea level.

## Credit Level

Support different types of cell.  You should support:

  * Road (shown as grey)
  * Water (shown as blue)
  * Grass (shown as green)
  * Mountain (shown as yellow)
  * Buildings (shown as brown) -- unlike the natural items above, building should _not_ have an elevation field. (ie. there should only be one shade of brown for buildings)

You should populate the grid with cells randomly chosen from road, water, grass, and mountain.  The cells are set with probabilities:

  * Road: 10%
  * Water: 20%
  * Grass: 40%
  * Mountain: 25%
  * Buildings: 5%

__For full marks, you must use inheritance appropriately in your solution__.
## (High) Distinction Level: 🤔

Expand the stage to have an area on the right for information to be displayed to the player.  In this area you should show the characteristics of whatever cell the mouse is currently over.  The characteristics are:

  * Type of cell (road, water, grass, mountain, etc)
  * The elevation of that cell

## Above and Beyond (no marks): 🤔

The terrain does not look very natural because surfaces don't just appear randomly. Find a better way to allocate cells that creates natural looking terrain. The terrain should still be procedurally generated so that each run of the program has different terrain, but it should be more like real terrain. If you need inspiration, [read this blog from the developers of Civilisation](https://archive.fo/MqaP2). If you attempt this task, include a ABOVE_AND_BEYOND.md file explaining how your algorithm works and where you found it (if you implemented an existing algorithm).
Submission

You must submit a zipped VSCode project.  Your maker will download your zip file, open it in VSCode and run it from there.  Please don't submit unnecessary temporary files (such as class files) in your zip file.
