package com.answer;

class Main {
    // 郵便番号検索システムのメイン処理を記述する
    public static void main(String[] args) {
        System.out.println("郵便番号検索システム");

        // Inputクラスのインスタンスを生成する(コンストラクタを呼び出す)
        Input input = new Input();

        // PostalCodePairsのインスタンスを生成する(コンストラクタを呼び出す)
        // 生成したインスタンスは変数postalCodePairsに代入する
        PostalCodePairs postalCodePairs = new PostalCodePairs();

        // InputクラスのgetInputPostalCodeメソッドを呼び出し、戻り値を変数に代入する
        // 戻り値は変数postalCodeに代入する(型はgetInputPostalCodeメソッドの宣言を確認する)
        String postalCode = input.getInputPostalCode();

        // postalCodePairsのgetAddressメソッドを呼び出す
        // 引数はpostalCode
        // 戻り値は変数addressに代入する(型はgetAddressメソッドの宣言を確認する)
        String address = postalCodePairs.getAddress(postalCode);

        // addressが空文字("")と等しいかで分岐する(equalsメソッドを呼び出す)
        // 空白だったら「該当する住所がありません」とコンソールに出力する
        // 空白でなかったら「検索結果：(address)」とコンソールに出力する
        if (address.equals("")) {
            System.out.println("該当する住所がありません");
        } else {
            System.out.println("検索結果：" + address);
        }

    }

}
