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


`curl --location --request POST 'localhost:8080/greeting' \
--header 'Content-Type: application/json' \
--data-raw '{
"message": "Nice to meet you"
}' -v`
