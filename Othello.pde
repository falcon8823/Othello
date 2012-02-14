// フィールド
Field f;

void setup() {
  // 初期化
  f = new Field(8);
  
  //画面サイズ
  size(f.requiredWidth(), f.requiredHeight());
  
  //描画関連
  smooth();
  stroke(255);
  strokeWeight(2);
}

void draw() {
  // 背景
  background(39, 214, 81);
  
  f.drawFrame(); // 枠線描画
  f.drawPieces(); // コマの描画
}

