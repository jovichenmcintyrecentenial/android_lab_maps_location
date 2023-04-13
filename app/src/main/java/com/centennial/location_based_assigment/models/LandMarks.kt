package com.centennial.location_based_assigment.models

class Landmark(val name: String,
               val province_name: String,
               val latitude: Double,
               val longitude: Double,
               val typeOfLandMark: String) {

        companion object {
            @JvmStatic
            fun getLandmarks(): List<Landmark> {
                return listOf(
                    Landmark("Niagara Falls", "Ontario", 43.0828, -79.0742, "Natural Landmark"),
                    Landmark("Banff National Park", "Alberta", 51.4968, -115.9281, "Natural Landmark"),
                    Landmark("Gros Morne National Park", "Newfoundland and Labrador", 49.6549, -57.3724, "Natural Landmark"),
                    Landmark("Nahanni National Park Reserve", "Northwest Territories", 61.7008, -124.0779, "Natural Landmark"),
                    Landmark("Citadel Hill", "Nova Scotia", 44.6426, -63.5812, "Historical Landmark"),
                    Landmark("The Forks", "Manitoba", 49.8875, -97.1317, "Historical Landmark"),
                    Landmark("Notre-Dame Basilica of Montreal", "Quebec", 45.5048, -73.5567, "Historical Landmark"),
                    Landmark("L'Anse aux Meadows National Historic Site", "Newfoundland and Labrador", 51.6014, -55.5356, "Historical Landmark"),
                    Landmark("CN Tower", "Ontario", 43.6426, -79.3871, "Cultural Landmark"),
                    Landmark("Canadian Museum of History", "Quebec", 45.4312, -75.7072, "Cultural Landmark"),
                    Landmark("Royal Ontario Museum", "Ontario", 43.6677, -79.3948, "Cultural Landmark"),
                    Landmark("Canadian Museum for Human Rights", "Manitoba", 49.8875, -97.1317, "Cultural Landmark"),
                    Landmark("Parliament Hill", "Ontario", 45.4236, -75.7009, "Architectural Landmark"),
                    Landmark("Château Frontenac", "Quebec", 46.8114, -71.2058, "Architectural Landmark"),
                    Landmark("Habitat 67", "Quebec", 45.5005, -73.5485, "Architectural Landmark"),
                    Landmark("Montreal Olympic Stadium", "Quebec", 45.5599, -73.5523, "Architectural Landmark"),
                    Landmark("Rideau Hall", "Ontario", 45.4509, -75.6832, "Political Landmark"),
                    Landmark("British Columbia Legislature Building", "British Columbia", 48.4213, -123.3656, "Political Landmark"),
                    Landmark("Manitoba Legislative Building", "Manitoba", 49.8882, -97.1411, "Political Landmark"),
                    Landmark("The Legislative Assembly of Alberta", "Alberta", 53.5444, -113.4909, "Political Landmark"),
                    Landmark("CN Tower", "Ontario", 43.6426, -79.3871, "Tourist Landmark"),
                    Landmark("Stanley Park", "British Columbia", 49.2998,-123.1244, "Tourist Landmark"),
                    Landmark("Old Montreal", "Quebec", 45.5075, -73.5543, "Tourist Landmark"),
                    Landmark("Whistler Ski Resort", "British Columbia", 50.1163, -122.9574, "Tourist Landmark")
                )
            }
    }
}


