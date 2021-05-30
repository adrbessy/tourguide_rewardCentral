package com.tourguide_rewardCentral.controller;

import com.tourguide_rewardCentral.service.RewardCentralService;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewardCentralController {

  private static final Logger logger = LogManager.getLogger(RewardCentralController.class);

  @Autowired
  RewardCentralService rewardCentralService;

  /**
   * Get last user location
   *
   * @param userId user id
   * @return last user location
   */
  @GetMapping("/attractionRewardPoints")
  public int getAttractionRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId) {
    logger.info("Get request with the endpoint 'userLocation'");
    int attractionRewardPoints = rewardCentralService.getAttractionRewardPoints(attractionId, userId);
    return attractionRewardPoints;
  }

}
