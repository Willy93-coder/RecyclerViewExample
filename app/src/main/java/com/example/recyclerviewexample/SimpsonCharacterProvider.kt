package com.example.recyclerviewexample

class SimpsonCharacterProvider {
    // Lo creamos como companion object para hacerlos accesibles desde cualquier parte de la app
    companion object {
        val simpsonCharacterList = listOf(
            SimpsonCharacter(
                "Lisa Simpson",
                "https://static.wikia.nocookie.net/lossimpson/images/e/ec/Lisa_Simpson.png/revision/latest?cb=20101120082357&path-prefix=es"
            ),
            SimpsonCharacter(
                "Bart Simpson",
                "https://static.wikia.nocookie.net/doblaje/images/8/86/Bart.png/revision/latest/thumbnail/width/360/height/450?cb=20131124215321&path-prefix=es"
            ),
            SimpsonCharacter(
                "Homer Simpson",
                "https://static.wikia.nocookie.net/lossimpson/images/b/bd/Homer_Simpson.png/revision/latest?cb=20100522180809&path-prefix=es"
            ),
            SimpsonCharacter(
                "Marge Simpson",
                "https://static.wikia.nocookie.net/simpsonstappedout/images/3/34/Marge_Character_Set.png/revision/latest?cb=20210816132320"
            ),
            SimpsonCharacter(
                "Maggie Simpson",
                "https://static.wikia.nocookie.net/lossimpson/images/9/9d/Maggie_Simpson.png/revision/latest?cb=20100529224628&path-prefix=es"
            ),
            SimpsonCharacter(
                "Milhouse Van Houten",
                "https://static.wikia.nocookie.net/lossimpson/images/1/11/Milhouse_Van_Houten.png/revision/latest?cb=20150426062610&path-prefix=es"
            ),
        )
    }
}