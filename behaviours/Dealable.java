package behaviours;

public interface Dealable {
  public void setBOGOF(boolean buyOneGetOneFree);
  public void addBOGOFItem(String itemName);
  public double checkForDeals(Basketable basket);
  public void setTenPercentOff(boolean tenPercentOff);
  public void setLoyaltyCard(boolean loyaltyCard);
}
