ntext, a gap is the occupied space between two free blocks.
      Those gaps are of interest if there is a chance that they become
      unoccupied, e.g. by class unloading. Then, the two adjacent free
      blocks, together with the now unoccupied space, form a new, large
      free block.