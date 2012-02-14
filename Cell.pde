final int SPACE = 0; //何もない
final int BLACK = 1; //黒コマ
final int WHITE = 2; //白コマ
final int PIECE_SIZE = 35; //コマのサイズ

// セルクラス
class Cell {
  private int type;
  private int x;
  private int y;
  
  // コンストラクタ
  public Cell(int x, int y, int type) {
    this.x = x;
    this.y = y;
    this.type = type;
  }
  
  // コマを描画
  public void drawPiece() {
    if(this.type != SPACE) {
      noStroke();
      fill(this.type == BLACK ? 0 : 255);
     
      //コマを描く
      ellipse(
        x * CELL_SIZE + 10 + CELL_SIZE / 2,
        y * CELL_SIZE + 10 + CELL_SIZE / 2,
        PIECE_SIZE, PIECE_SIZE
      );
    }
  }
  
  // クリックされたか
  public boolean isClicked(int mx, int my) {
    if(
      mx > (x * CELL_SIZE + 10) && mx < (x * CELL_SIZE + 10 + CELL_SIZE) &&
      my > (y * CELL_SIZE + 10) && my < (y * CELL_SIZE + 10 + CELL_SIZE) ) {
      return true;
    }
    return false;
  }
}

