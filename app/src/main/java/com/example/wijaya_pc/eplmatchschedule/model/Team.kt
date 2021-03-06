package com.example.wijaya_pc.eplmatchschedule.model

import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("idTeam")
    var teamId: String? ,

    @SerializedName("strTeam")
    var teamName: String? ,

    @SerializedName("strTeamBadge")
    var teamBadge: String?
)
