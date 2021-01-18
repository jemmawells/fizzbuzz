import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class FizzbuzzKtTest{

    @Test
    fun `Fizzbuzz of 1 is 1`(){

        assertThat(fizzbuzz(1)).isEqualTo("1")
    }

    @Test
    fun `Fizzbuzz of 2 is 2`(){

        assertThat(fizzbuzz(2)).isEqualTo("2")
    }

    @Test
    fun `Fizzbuzz of 3 is Fizz`(){

        assertThat(fizzbuzz(3)).isEqualTo("Fizz")
    }

    @Test
    fun `Fizzbuzz of 5 is Buzz`(){

        assertThat(fizzbuzz(5)).isEqualTo("Buzz")
    }

    @Test
    fun `Fizzbuzz of 6 is Fizz`(){

        assertThat(fizzbuzz(6)).isEqualTo("Fizz")
    }

    @Test
    fun `Fizzbuzz of 10 is Buzz`(){

        assertThat(fizzbuzz(10)).isEqualTo("Buzz")
    }

    @Test
    fun `Fizzbuzz of 15 is Fizzbuzz`(){

        assertThat(fizzbuzz(15)).isEqualTo("Fizzbuzz")
    }

    @Test
    fun `Fizzbuzz of 30 is Fizzbuzz`(){

        assertThat(fizzbuzz(30)).isEqualTo("Fizzbuzz")
    }

}