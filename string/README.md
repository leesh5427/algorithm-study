### 기본 입출력
- InputStream, BufferedReader, Scanner 의 각각 차이 [링크](https://makemethink.tistory.com/170)
- BufferedReader, Scanner, StringTokenizer, StringBuilder 를 사용해야하는 이유 [링크](https://rlakuku-program.tistory.com/33)
- StringBuffer, StringBuilder, String 의 차이점 [링크](https://cjh5414.github.io/why-StringBuffer-and-StringBuilder-are-better-than-String/)

### String
- 자바 원시타입(Primitive)은 "==(주소값 비교)" 해도 값 비교, 참조타입(Reference)은 == 하면 주소값 비교
- String의 경우, `new`로 생성할 경우 JVM 안의 String Constant Pool 에 새로 생성되기 때문에 제대로 비교할 수 없음 [링크 : String을 new로 생성하지 말아야하는 이유](https://starkying.tistory.com/entry/what-is-java-string-pool)
- NPE(Null Pointer Exception)을 예방하는 좋은 습관 [링크](https://w00ks.tistory.com/entry/NullPointerException%EC%9D%84-%EC%98%88%EB%B0%A9%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95)
- 자바 HashMap을 효과적으로 사용하는 방법 [링크](http://tech.javacafe.io/2018/12/03/HashMap/)
- Arrays.asList 사용시 동기화 문제 [링크](https://hianna.tistory.com/551)
- 데이터를 원하는 Collection으로 변경하고 싶을때는 Stream의 collect를 잘 써보자 [링크](https://hianna.tistory.com/551)
- Stream 사용 꿀팁
  - List<String> list = Stream.of(arr).collect(Collectors.toList());
  - https://codechacha.com/ko/java-convert-string-to-chararray/
- 자바 Collection, Map 자세한 설명 [링크](https://withwani.tistory.com/150)
- How to convert char[] to Character[] [링크](https://dirask.com/posts/Java-convert-char-array-to-Character-array-BDn80j)
- 