package com.answer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class PostalCodePairs {
    private ArrayList<PostalCodePair> postalCodePairs;

    public PostalCodePairs() {
        postalCodePairs = new ArrayList<>();
        setUp();
    }

    private void setUp() {
        // Path.ofを使って "src/main/resources/resources.txt" のパスを得る
        Path path = Path.of("src/main/resources/resources.txt");

        // FilesクラスのreadAllLinesメソッドを呼び出し、resources.txtのすべての行を取得する
        try {
            List<String> allLines = Files.readAllLines(path);
            // allLinesを1行ずつループさせる
            for (String line : allLines) {
                // 行の内容を郵便番号と住所に分割する
                List<String> list = List.of(line.split(","));

                // 郵便番号(postalCode)と住所(address)を表すString型の変数を宣言する
                // listの0番目の要素を郵便番号、1番目の要素を住所に代入する
                String postalCode = list.get(0);
                String address = list.get(1);

                // PostalCodePairインスタンスを生成する(コンストラクタを呼び出す)
                // 郵便番号(postalCode)と住所(address)を引数に渡す
                PostalCodePair pair = new PostalCodePair(postalCode, address);

                // postalCodePairsフィールド(ArrayList<PostalCodePair>型)にpairを追加する
                postalCodePairs.add(pair);
            }
        } catch (IOException e) {
            // 例外発生時はスタックトレースを出力する
            e.printStackTrace();
        }
    }

    // getAddressメソッドを宣言する
    // 引数は、入力された郵便番号postalCode(String型)
    // 戻り値は、検索結果(String型)
    // 他のクラスから利用するのでpublicにする
    public String getAddress(String postalCode) {
        // postalCodePairs(ArrayList)の要素をループさせる
        // getPostalCodeメソッドを呼び出し、要素が持つ郵便番号を取り出す
        // 取り出した郵便番号はString型の変数codeに代入する
        for (PostalCodePair pair : postalCodePairs) {
            String code = pair.getPostalCode();
            // 引数の郵便番号(postalCode)と等しいかで分岐する(equalsメソッドを使う)
            // 等しい場合は、要素が持つ住所を取り出し、戻り値にする
            if (code.equals(postalCode)) {
                return pair.getAddress();
            }
        }
        // リスト内の要素を最後まで探しても、postalCodeと等しいものが見つからなかった時は、
        // 空文字("")を戻り値にする
        return "";
    }
}
