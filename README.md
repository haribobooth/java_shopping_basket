# Shopping Basket
### Basket to hold items and calculate deals
TDD Approached shopping basket code test.
  - Behaviours
    * Basketable: created for asbtraction
    * Itemable: created for abstraction
    * Dealable: created for abstraction
  - Models
    * Item(Itemable): hold a name string (could alternatively be an enum), and a price double
    * Basket(Basketable): holds itemables, has method for calculating/setting subtotal and setting finaltotal as well as a method to check deals, which takes in a dealable
    * DealChecker(Dealable): holds booleans for each deal to decide what methods to apply to given baskets, has main method for checking basket and other methods for each deal
  - Specs
    * All models are tested and were created with TDD
    
