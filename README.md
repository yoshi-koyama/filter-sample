# 概要
このプロジェクトはSpring Security初心者の学習用プロジェクトです

# 前提
- Java 11
- Spring Boot 2.6.3

# 動作確認

`$ git clone https://github.com/yoshi-koyama/filter-sample.git`

sshでcloneする場合は

`$ git clone git@github.com:yoshi-koyama/filter-sample.git`

プロジェクトのルートディレクトリに移動する

`$ cd filter-sample`

アプリケーションを起動する

`./mvnw spring-boot:run`

ターミナルから以下コマンドをそれぞれ実行して期待する結果が得られること
また、Spring Bootを起動しているログから、Filterの出力結果が見られること

`curl --location --request GET 'localhost:8080/hello' -v`
<img width="853" alt="スクリーンショット 2022-02-12 12 56 53" src="https://user-images.githubusercontent.com/62045457/153695851-495794b4-bed7-4458-b101-3d73adacfe96.png">

<img width="1221" alt="スクリーンショット 2022-02-12 12 58 26" src="https://user-images.githubusercontent.com/62045457/153695857-e99f7677-b445-49bc-9789-fc8a28a5a04c.png">

`curl --location --request POST 'localhost:8080/greeting' \
--header 'Content-Type: application/json' \
--data-raw '{
"message": "Nice to meet you"
}' -v`
<img width="952" alt="スクリーンショット 2022-02-12 12 57 17" src="https://user-images.githubusercontent.com/62045457/153695913-81e090c5-3c18-47d6-b496-846cfac1b907.png">
<img width="1194" alt="スクリーンショット 2022-02-12 12 58 57" src="https://user-images.githubusercontent.com/62045457/153695921-98e7fd62-9d87-421c-9e0d-a3c64a39c9bf.png">

