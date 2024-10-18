package org.hyperskill.aquarium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.hyperskill.aquarium.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val listOfAnimalsImages = intent.getSerializableExtra("imageAnimals") as? List<Int>
            val listOfAnimalsNames = intent.getSerializableExtra("nameAnimals") as? List<String>
            val listOfAnimalsDescription = intent.getSerializableExtra("descriptionAnimals") as? List<String>

            binding.imageView.setImageResource(listOfAnimalsImages?.get(0) ?: R.drawable.image1)
            binding.tvName.text = listOfAnimalsNames?.get(0) ?: "Koi Carp"
            binding.tvDescription.text = listOfAnimalsDescription?.get(0) ?: ("These colorful, ornamental fish are a variety of the Amur carp. " +
                    "They were originally found in Central Europe and Asia, " +
                    "but they’ve spread to many other parts of the world. " +
                    "Koi carp are popular with breeders, and there are currently over 100 varieties " +
                    "created through breeding.\n" +
                    "\n" +
                    "The average age of a koi carp can vary based on the part of the world it’s bred in. " +
                    "Carps bred outside of Japan have an average lifespan of around 15 years," +
                    " while carps bred in Japan can live 40 years or more. The oldest koi carp on record," +
                    " which was a fish named Hanako, reportedly lived for 226 years!")


        }
    }
}
