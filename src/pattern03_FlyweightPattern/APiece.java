package pattern03_FlyweightPattern;

public abstract class APiece {
      protected String inKind;
      
      public APiece(String inKind) {
    	  this.inKind = inKind;
      }
      
      //下棋时落子的位置
      public abstract void Play(int x, int y) ;
      
}
