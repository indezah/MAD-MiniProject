import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Task(
    val title: String,
    val description: String,
    val dueDate: String // Add more properties as needed
) : Parcelable
