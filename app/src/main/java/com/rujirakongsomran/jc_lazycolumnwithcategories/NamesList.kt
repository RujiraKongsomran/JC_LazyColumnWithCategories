package com.rujirakongsomran.jc_lazycolumnwithcategories

val names = listOf(
    "Chelsea Murray",
    "Brianna Wells",
    "Fiona Barnes",
    "Marcus Payne",
    "Ryan Barnes",
    "Aiden Carter",
    "Abigail Higgins",
    "Carl Murphy",
    "Chester Payne",
    "Rubie Casey",
    "Grace Lloyd",
    "Julian	Ross",
    "Kristian Carter",
    "Lilianna Campbell",
    "Rubie Owens",
    "Ned Carter",
    "Lenny Lloyd",
    "Carina	Myers",
    "Grace Harris",
    "Abigail Morrison",
    "James Barnes",
    "Jacob Elliott",
    "Ryan Bailey",
    "Kelvin	Thompson",
    "Alissa Sullivan",
    "Jenna Elliott",
    "Oliver Elliott",
    "Elise Perry",
    "Alford	Russell",
    "Adam Richardson",
    "Ada Harrison",
    "Adele Watson",
    "Kevin Hill",
    "Adam Davis",
    "George Harris",
    "Dale Dixon",
    "Tyler Bennett",
    "Sabrina Anderson",
    "Vivian Campbell",
    "Adam Hall",
    "Alberta West",
    "Nicole Robinson",
    "Chloe Grant",
    "Violet	Foster",
    "Alen Wright",
    "Kate Roberts",
    "Nicholas Elliott",
    "Lilianna Martin",
    "Caroline Armstrong",
    "Sawyer	Riley"
).groupBy {
    it.first()
}.toSortedMap()