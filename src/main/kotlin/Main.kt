import java.security.SecureRandom
import java.util.Base64

fun main() {
    // Define the length of the secret key (in bytes)
    val keyLength = 32 // Adjust the length as needed (32 bytes = 256 bits)

    // Generate a random secret key
    val secretKey = generateRandomKey(keyLength)

    // Encode the secret key as a Base64 string
    val base64Key = encodeBase64(secretKey)

    // Print the generated secret key
    println("Generated Secret Key: $base64Key")
}

// Function to generate a random secret key of the specified length
fun generateRandomKey(length: Int): ByteArray {
    val random = SecureRandom()
    val key = ByteArray(length)
    random.nextBytes(key)
    return key
}

// Function to encode a byte array as a Base64 string
fun encodeBase64(bytes: ByteArray): String {
    return Base64.getEncoder().encodeToString(bytes)
}