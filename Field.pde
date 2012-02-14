final int CELL_SIZE = 50; //1セルのサイズ
final int SPAN = 10; //余白

// フィールドクラス
class Field {
  private final int SIZE;
  private Cell[][] cells;
  
  public Field(int s) {
    SIZE = s; //縦横それぞれのセル数
  }
  
  // フィールドの初期化
  public void init() {
  }
  
  // コマの描画
  public void drawPieces() {
  }
  
  // 画面・横サイズ
  public int requiredWidth() {
    return CELL_SIZE * SIZE + SPAN * 2;
  }
  
  // 画面・縦サイズ
  public int requiredHeight() {
    return CELL_SIZE * SIZE + SPAN * 2;
  }
  
  // 枠の描画
  public void drawFrame() {
    // 枠
    for(int x = 0; x <= SIZE; x++) {
      int i = x * CELL_SIZE + SPAN;
      int j = SIZE * CELL_SIZE + SPAN;
      // 縦線
      line(i, SPAN, i, j);
      // 横線
      line(SPAN, i, j, i);
    }
    
    //点
    fill(0);
    ellipse(2 * CELL_SIZE + 10, 2 * CELL_SIZE + 10, 5, 5); // 左上
    ellipse(6 * CELL_SIZE + 10, 2 * CELL_SIZE + 10, 5, 5); // 右上
    ellipse(2 * CELL_SIZE + 10, 6 * CELL_SIZE + 10, 5, 5); // 左下
    ellipse(6 * CELL_SIZE + 10, 6 * CELL_SIZE + 10, 5, 5); // 右下

  }
  
}


