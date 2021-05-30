package com.tourguide_rewardCentral.service;

import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

@Service
public class RewardCentralServiceImpl implements RewardCentralService {

  private static final Logger logger = LogManager.getLogger(RewardCentralServiceImpl.class);

  @Autowired
  RewardCentral rewardCentral;

  /**
   * Get the last user location
   * 
   * @param userId user id
   * @return last user visited location
   */
  @Override
  public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
    logger.debug(rewardCentral.getAttractionRewardPoints(attractionId, userId));
    return rewardCentral.getAttractionRewardPoints(attractionId, userId);
  }

}
