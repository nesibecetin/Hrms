import axios from "axios";
import React from 'react'

export default class JobAdvertismentService {
  
    getJobAdvertisement() {
        return axios.get("http://localhost:8080/api/jobadvertisements/getall");
    }
}

