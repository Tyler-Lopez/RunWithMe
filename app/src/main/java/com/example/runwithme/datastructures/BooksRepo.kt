import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow

class BooksRepo {

    private val firestore = FirebaseFirestore.getInstance()

    @OptIn(ExperimentalCoroutinesApi::class)
    fun getBookDetails() = callbackFlow {

        val collection = firestore.collection("books")
        val snapshotListener = collection.addSnapshotListener { value, error ->
            val response = if (error == null) {
                value
            } else {
                error
            }

            offer(response)
        }

        awaitClose {
            snapshotListener.remove()
        }
    }
    fun addBook() {
        println("here")
        firestore.collection("testsStrings")
    }
}