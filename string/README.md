### 기본 입출력
- InputStream, BufferedReader, Scanner 의 각각 차이 [링크](https://makemethink.tistory.com/170)
- BufferedReader, Scanner, StringTokenizer, StringBuilder 를 사용해야하는 이유 [링크](https://rlakuku-program.tistory.com/33)
- StringBuffer, StringBuilder, String 의 차이점 [링크](https://cjh5414.github.io/why-StringBuffer-and-StringBuilder-are-better-than-String/)

### String
- 자바 원시타입(Primitive)은 "==(주소값 비교)" 해도 값 비교, 참조타입(Reference)은 == 하면 주소값 비교
- String의 경우, `new`로 생성할 경우 JVM 안의 String Constant Pool 에 새로 생성되기 때문에 제대로 비교할 수 없음 [링크 : String을 new로 생성하지 말아야하는 이유](https://starkying.tistory.com/entry/what-is-java-string-pool)