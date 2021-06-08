package com.tourguide_rewardCentral.unitTest.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import com.tourguide_rewardCentral.service.RewardCentralService;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import rewardCentral.RewardCentral;


@SpringBootTest()
public class TestRewardCentralServiceImpl {

  @Autowired
  private RewardCentralService rewardCentralService;

  @MockBean
  RewardCentral rewardCentralMock;

  @Test
  public void testGetAttractionRewardPoints() {
    UUID userId = UUID.randomUUID();
    UUID attractionId = UUID.randomUUID();
    int points = 5;

    when(rewardCentralMock.getAttractionRewardPoints(attractionId, userId)).thenReturn(points);
    int result = rewardCentralService.getAttractionRewardPoints(attractionId, userId);

    assertThat(result).isEqualTo(points);
  }

}
