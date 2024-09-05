/*public class Car {
    final String name = "Test";
    String color = "Red";
    static final String TALK = "TALK";
}
*/


class Car {
    val name: String = "Test"
    var color: String = "Red"

    companion object {
        const val TALK: String = "TALK"
    }
}
