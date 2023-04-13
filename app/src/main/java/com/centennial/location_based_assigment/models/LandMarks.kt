package com.centennial.location_based_assigment.models

class Landmark(val name: String,
               val province_name: String,
               val latitude: Double,
               val longitude: Double,
               val typeOfLandMark: String) {

        companion object {
            @JvmStatic
            fun filterByType(type: String): List<Landmark> {
                return getLandmarks().filter { it.typeOfLandMark == type }
            }
            @JvmStatic
            fun getLandmarks(): List<Landmark> {
                return listOf(
                    Landmark("Niagara Falls", "Ontario", 43.082818, -79.074162, "Natural Landmark"),
                    Landmark("Banff National Park", "Alberta", 51.496818, -115.928056, "Natural Landmark"),
                    Landmark("Gros Morne National Park", "Newfoundland and Labrador", 49.649611, -57.402206, "Natural Landmark"),
                    Landmark("Nahanni National Park Reserve", "Northwest Territories", 61.686452, -124.207894, "Natural Landmark"),
                    Landmark("Citadel Hill", "Nova Scotia", 44.642556, -63.576645, "Historical Landmark"),
                    Landmark("The Forks", "Manitoba", 49.887547, -97.131723, "Historical Landmark"),
                    Landmark("Notre-Dame Basilica of Montreal", "Quebec", 45.504847, -73.556728, "Historical Landmark"),
                    Landmark("L'Anse aux Meadows National Historic Site", "Newfoundland and Labrador", 51.598998, -55.529725, "Historical Landmark"),
                    Landmark("CN Tower", "Ontario", 43.642566, -79.387057, "Cultural Landmark"),
                    Landmark("Canadian Museum of History", "Quebec", 45.425392, -75.716978, "Cultural Landmark"),
                    Landmark("Royal Ontario Museum", "Ontario", 43.668104, -79.396935, "Cultural Landmark"),
                    Landmark("Canadian Museum for Human Rights", "Manitoba", 49.886580, -97.147361, "Cultural Landmark"),
                    Landmark("Parliament Hill", "Ontario", 45.423592, -75.700929, "Architectural Landmark"),
                    Landmark("Château Frontenac", "Quebec", 46.811369, -71.204849, "Architectural Landmark"),
                    Landmark("Habitat 67", "Quebec", 45.500132, -73.542648, "Architectural Landmark"),
                    Landmark("Montreal Olympic Stadium", "Quebec", 45.559873, -73.551852, "Architectural Landmark"),
                    Landmark("Rideau Hall", "Ontario", 45.450863, -75.684077, "Political Landmark"),
                    Landmark("British Columbia Legislature Building", "British Columbia", 48.422115, -123.365856, "Political Landmark"),
                    Landmark("Manitoba Legislative Building", "Manitoba", 49.883571, -97.142834, "Political Landmark"),
                    Landmark("The Legislative Assembly of Alberta", "Alberta", 53.534380, -113.501888, "Political Landmark"),
                    Landmark("CN Tower", "Ontario", 43.642567, -79.387057, "Tourist Landmark"),
                    Landmark("Stanley Park", "British Columbia", 49.301625, -123.141875, "Tourist Landmark"),
                    Landmark("Old Montreal", "Quebec", 45.505133, -73.552323, "Tourist Landmark"),
                    Landmark("Whistler Ski Resort", "British Columbia", 50.118698, -122.957507, "Tourist Landmark")

                )
            }
    }
}


