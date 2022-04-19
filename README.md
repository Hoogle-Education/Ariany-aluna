# Ariany-aluna

|PaymentContract|
|------------|
| - price : `double` |
| - type : `String` |
| - times : `int` |
||
| + calculateFees( ) : `double` |
| + calculateFees( times : `int` ) : `double` |

----

| Student |
|-------|
| - name : `String` |
| - age : `int` |
| - classGrade: `int` |
| - contract : `PaymentContract` |
| - score : `String` |
||
| + isApproved() : `boolean` |
| + hasScore() : `boolean` |
| + makeBirthday() : `void`|
| + makeExam() : `void` |

---

|School|
|----|
| - class : Student[1000] |
| - numberOfStudents : int |
||
| + main( ... ) |