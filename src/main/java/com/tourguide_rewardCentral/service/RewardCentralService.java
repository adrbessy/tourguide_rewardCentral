package com.tourguide_rewardCentral.service;

import java.util.UUID;

public interface RewardCentralService {

  int getAttractionRewardPoints(UUID attractionId, UUID userId);

}
